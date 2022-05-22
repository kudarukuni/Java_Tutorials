#include <iostream>
using namespace std;

int main(){
     int m1, m2, m3, m4, m5, tot;
     float per;

     cout << "Enter Marks of Five Subjects: " << endl;
     cin >> m1;
     cin >> m2;
     cin >> m3;
     cin >> m4;
     cin >> m5;
     tot = m1 + m2 + m3 + m4 + m5;
     cout << "Total Marks of Student = " << tot << endl;
     if(m1 >= 40 && m2 >= 40 && m3 >= 40 && m4 >= 40 && m5 >= 40){
          cout << "Student is PASS" << endl;
          per = tot/5.0;

          cout << "Percentage of a Student = " << per << endl;

          if(per >= 75){
               cout << "Student Got Distinction" << endl;
          }
     }
     else{
          cout << "Student is FAIL" << endl;
     }
     return 0;
}
