#include <iostream>
using namespace std;

long hms_to_secs(int h, int m, int s) {
    return h * 3600 + m * 60 + s;
}

int main() {
    int h, m, s;

    while (true) {
        cout << "Enter a time value in the format HH:MM:SS (enter -1 to exit): ";
        char c1, c2;
        cin >> h;
        
        // If the user enters -1, exit the program
        if (h == -1)
            break;

        cin >> c1 >> m >> c2 >> s;

        long t = hms_to_secs(h, m, s);
        cout << "Equivalent time in seconds: " << t << endl;
    }

    return 0;
}
