// This program is written by Aditya Gupta(231B017)
#include<iostream>
#include<cstring>
using namespace std;
class Movie{
    char title[100], directorName[100];
    int year;
    public:
    void setTitle(char *);
    void setYear(int);
    void setDirector(char *);
    void displayData();
};
void Movie::setTitle(char *t){
    strcpy(title, t);
}
void Movie::setYear(int i){
    year = i;
}
void Movie::setDirector(char *d){
    strcpy(directorName, d);
}
void Movie::displayData(){
    cout<<"Movie Info :-\n";
    cout<<"Title : "<<title<<endl;
    cout<<"Year : "<<year<<endl;
    cout<<"Director : "<<directorName<<endl;
}
int main(){
    char mN[100] = "Space";
    char dN[100] = "Starc";
    Movie myFavoriteMovie;
    myFavoriteMovie.setTitle(mN);
    myFavoriteMovie.setYear(2020);
    myFavoriteMovie.setDirector(dN);
    myFavoriteMovie.displayData();
    return 0;
}