#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int generateRandomNumber(int min, int max) {
    return rand() % (max - min + 1) + min;
}

void askQuestion(int num1, int num2) {
    cout << "How much is " << num1 << " times " << num2 << "?" << endl;
}

int main() {
    srand(time(0));

    int correctCount = 0;
    int incorrectCount = 0;
    int totalQuestions = 0;
    int difficulty = 1;

    while (true) {
        int num1, num2;
        num1 = generateRandomNumber(1, difficulty == 1 ? 9 : 99);
        num2 = generateRandomNumber(1, difficulty == 1 ? 9 : 99);
        
        askQuestion(num1, num2);

        int answer, result;
        cin >> answer;

        result = answer == num1 * num2 ? 1 : 0;

        switch (result) {
            case 1:
                switch (generateRandomNumber(1, 4)) {
                    case 1:
                        cout << "Very good!" << endl;
                        break;
                    case 2:
                        cout << "Excellent!" << endl;
                        break;
                    case 3:
                        cout << "Nice work!" << endl;
                        break;
                    case 4:
                        cout << "Keep up the good work!" << endl;
                        break;
                }
                correctCount++;
                break;
            case 0:
                switch (generateRandomNumber(1, 4)) {
                    case 1:
                        cout << "No. Please try again." << endl;
                        break;
                    case 2:
                        cout << "Wrong. Try once more." << endl;
                        break;
                    case 3:
                        cout << "Don't give up!" << endl;
                        break;
                    case 4:
                        cout << "No. Keep trying." << endl;
                        break;
                }
                incorrectCount++;
                break;
        }

        totalQuestions++;
        if (totalQuestions >= 10) {
            double percentage = (double)correctCount / totalQuestions * 100;
            if (percentage < 75) {
                cout << "Please ask your teacher for extra help." << endl;
            } else {
                cout << "Congratulations, you are ready to go to the next level!" << endl;
            }
            correctCount = 0;
            incorrectCount = 0;
            totalQuestions = 0;
            difficulty++;
        }
    }

    return 0;
}
