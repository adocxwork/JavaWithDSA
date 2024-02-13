// This program is written by Aditya Gupta(231B017)
#include <iostream>
#include <cstring>

using namespace std;
struct EnginePart {
    char serialNumber[4];
    int yearOfManufacturing;
    string materialType;
    int quantity;
};
int getRandomNumber(int min, int max) {
    return rand() % (max - min + 1) + min;
}
string getRandomMaterialType() {
    string materials[] = {"Steel", "Aluminum", "Iron"};
    return materials[rand() % 3];
}
void initializeStructure(EnginePart& part, int index) {
    char s[] = "AAA";
    s[2] = '1'+index%10;
    if(index>=10){
        int temp = index%10;
        char c = 'A'+temp;
        s[0] = c;
        s[1] = c;
    }
    strcpy(part.serialNumber,s);
    part.yearOfManufacturing = getRandomNumber(1990, 2018);
    part.materialType = getRandomMaterialType();
    part.quantity = getRandomNumber(1, 1000);
}

void displayPartsInRange(EnginePart parts[], char startSerial[], char endSerial[]) {
    for (int i = 0; i < 60; ++i) {
        if (parts[i].serialNumber[0] >= 'B' && parts[i].serialNumber[0] <= 'C' && parts[i].serialNumber[2] >= '1' && parts[i].serialNumber[2] <= '6') {
            cout << "Serial Number: " << parts[i].serialNumber << ", Year: " << parts[i].yearOfManufacturing
                 << ", Material: " << parts[i].materialType << ", Quantity: " << parts[i].quantity << endl;
        }
    }
}

int main() {
    EnginePart parts[60];
    for (int i = 0; i < 60; ++i) {
        initializeStructure(parts[i], i);
    }
    char startSerial[4] = "BB1";
    char endSerial[4] = "CC6";

    cout << "Parts within the range [" << startSerial << ", " << endSerial << "]:" << endl;
    displayPartsInRange(parts, startSerial, endSerial);

    return 0;
}
