#include <iostream>

using namespace std;

class Matrix {
private:
    int m, n;
    int **matrix;

public:
    // Constructor to allocate memory dynamically
    Matrix(int rows, int cols) : m(rows), n(cols) {
        matrix = new int*[m];
        for (int i = 0; i < m; ++i) {
            matrix[i] = new int[n];
        }
    }

    // Destructor to deallocate memory
    ~Matrix() {
        for (int i = 0; i < m; ++i) {
            delete[] matrix[i];
        }
        delete[] matrix;
    }

    // Function to set data in the matrix
    void setData() {
        cout << "Enter matrix elements:" << endl;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                cin >> matrix[i][j];
            }
        }
    }

    // Function to print the matrix
    void printData() {
        cout << "Matrix:" << endl;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                cout << matrix[i][j] << " ";
            }
            cout << endl;
        }
    }

    // Overloading + operator for matrix addition
    Matrix operator+(const Matrix& other) {
        Matrix result(m, n);
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                result.matrix[i][j] = matrix[i][j] + other.matrix[i][j];
            }
        }
        return result;
    }

    // Overloading * operator for matrix multiplication
    Matrix operator*(const Matrix& other) {
        if (n != other.m) {
            cerr << "Matrix dimensions are incompatible for multiplication." << endl;
            return Matrix(0, 0);
        }

        Matrix result(m, other.n);
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < other.n; ++j) {
                result.matrix[i][j] = 0;
                for (int k = 0; k < n; ++k) {
                    result.matrix[i][j] += matrix[i][k] * other.matrix[k][j];
                }
            }
        }
        return result;
    }
};

int main() {
    int m, n;
    cout << "Enter dimensions of matrices (m n): ";
    cin >> m >> n;

    // Create two Matrix objects
    Matrix mat1(m, n);
    Matrix mat2(m, n);

    // Input elements for matrices
    cout << "Enter elements for matrix 1:" << endl;
    mat1.setData();
    cout << "Enter elements for matrix 2:" << endl;
    mat2.setData();

    // Matrix addition
    Matrix additionResult = mat1 + mat2;
    cout << "Result of matrix addition:" << endl;
    additionResult.printData();

    // Matrix multiplication
    cout << "Result of matrix multiplication:" << endl;
    Matrix multiplicationResult = mat1 * mat2;
    multiplicationResult.printData();

    return 0;
}
