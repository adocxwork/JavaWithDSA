#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;
int correct = 0, wrong = 0;

void rD(void){
    cout << "Game finished\nResult is given below!!" << endl;
    cout << "---------------------------------------------------" << endl;
    cout << "Right Answers :" << correct << endl;
    cout << "Wrong Answers :" << wrong << endl;
    float result = (static_cast<float>(correct) / (correct + wrong)) * 100;
    cout << "The percentage is:" << result << endl;
    cout << "---------------------------------------------------" << endl;
}
void cmd(int x){
    if (x > 4) x = 0;
    switch (x){
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
    default:
        cout << "Nice Work" << endl;
    }
}
void Incmd(int x){
    if (x > 4) x == 0;
    switch (x){
    case 1:
        cout << "No. Please try again." << endl;
        break;
    case 2:
        cout << "Wrong. Try once more.!" << endl;
        break;
    case 3:
        cout << "Dont give up!" << endl;
        break;
    case 4:
        cout << "You can do it!" << endl;
        break;
    default:
        cout << "No. Keep trying." << endl;
    }
}
bool dQ(void){
    int x, y, z, xx;
    x = rand() % 10;
    y = rand() % 10;
a:
    cout << x << "X" << y << "=";
    cin >> z;
    if (z == -1){
        rD();
        exit(1);
    }
    if (z == (x * y)){
        xx = rand() % 5;
        cmd(xx);
        correct++;
        return true;
    }
    else{
        xx = rand() % 5;
        Incmd(xx);
        wrong++;
        goto a;
    }
}
bool dql2(void){
    int x, y, z, xx;
    x = rand() % 100;
    y = rand() % 100;
a:
    cout << x << "X" << y << "=";
    cin >> z;
    if (z == -1){
        rD();
        exit(1);
    }
    if (z == (x * y)){
        xx = rand() % 5;
        cmd(xx);
        correct++;
        return true;
    }
    else{
        xx = rand() % 5;
        Incmd(xx);
        wrong++;
        goto a;
    }
}
int main(){
    int check = 0;
    cout << "Welcome!!" << endl;
    cout << "You can Exit By pressing (-1)" << endl;
    while (true){
        check++;
        if (check == 6) cout << "Entered in level 2 :-" << endl;
        if (check > 5) dql2();
        else dQ();
    }
    return 0;
}