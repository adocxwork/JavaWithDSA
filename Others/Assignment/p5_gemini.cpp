#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

// Function to generate a new multiplication question
void generateQuestion(int difficultyLevel, int& num1, int& num2) {
    switch (difficultyLevel) {
        case 1: // Single-digit numbers
            num1 = rand() % 10 + 1;
            num2 = rand() % 10 + 1;
            break;
        case 2: // Two-digit numbers
            num1 = rand() % 90 + 10;
            num2 = rand() % 90 + 10;
            break;
        // Add more cases for other difficulty levels as needed
        default:
            cout << "Invalid difficulty level. Please choose 1 or 2." << endl;
            exit(1);
    }
}

// Function to select a random response message
string getRandomResponse(bool isCorrect) {
    int randomIndex = rand() % 4;
    string responses[4];

    if (isCorrect) {
        responses[0] = "Very good!";
        responses[1] = "Excellent!";
        responses[2] = "Nice work!";
        responses[3] = "Keep up the good work!";
    } else {
        responses[0] = "No. Please try again.";
        responses[1] = "Wrong. Try once more.";
        responses[2] = "Don't give up!";
        responses[3] = "No. Keep trying.";
    }

    return responses[randomIndex];
}

int main() {
    srand(time(0)); // Seed random number generator

    int difficultyLevel, num1, num2, correctAnswers = 0, totalAnswers = 0;
    double percentageCorrect;
    char answerChoice;

    cout << "Welcome to the Multiplication Trainer!" << endl;
    cout << "Choose difficulty level (1: Single-digit, 2: Two-digit): ";
    cin >> difficultyLevel;

    while (true) {
        // Generate a new question
        generateQuestion(difficultyLevel, num1, num2);
        totalAnswers++;

        cout << "How much is " << num1 << " times " << num2 << "? ";
        cin >> answerChoice;

        int answer = answerChoice - '0'; // Convert ASCII character to integer

        // Check answer and provide feedback
        if (answer == num1 * num2) {
            correctAnswers++;
            cout << getRandomResponse(true) << endl;
        } else {
            cout << getRandomResponse(false) << endl;
        }

        // Check if 10 answers have been given and calculate percentage
        if (totalAnswers == 10) {
            percentageCorrect = static_cast<double>(correctAnswers) / totalAnswers * 100;

            if (percentageCorrect >= 75) {
                cout << "Congratulations, you are ready to go to the next level!" << endl;
            } else {
                cout << "Please ask your teacher for extra help." << endl;
            }

            // Reset variables and ask if user wants to continue
            correctAnswers = 0;
            totalAnswers = 0;
            cout << "\nDo you want to try again? (y/n): ";
            cin >> answerChoice;
            if (answerChoice != 'y' && answerChoice != 'Y') {
                break;
            }
        }
    }

    cout << "Goodbye!" << endl;

    return 0;
}
