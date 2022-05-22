#include<bits/stdc++.h>
#include <fstream>
#include <iostream>
#include <string>
#ifdef unix
#endif
#ifndef unix
#define CLS() system("cls")
#include<windows.h>
#define CANDIDATE_COUNT
#define CANDIDATE1 "Emerson Munangagwa"
#define CANDIDATE2 "Nelson Chamisa"
#define CANDIDATE3 "Jean Mujuru"
#define CANDIDATE4 "Emannuel Mawarire"
#endif
#define RULE(x) cout<<'\n'; for(int _=0;_<80;_++) cout<<x; cout<<'\n'
#define CL(cl,x) cl==0?1:cl==x
using namespace std;

int votesCount1 = 0, votesCount2 = 0, votesCount3 = 0, votesCount4 = 0, spoiledtvotes = 0; //

class Register{
  public:
    string username, password;
};
class Login{
  public:
    string inpUsername, inpPassword;
};
void castVote(){
    int choice;
    cout<<"\n\n!!!!!!!!!!Please Vote For Your Favorite Candidate!!!!!!!!!!\n";
    cout<< "\n 1. " << CANDIDATE1;
    cout<< "\n 2. " << CANDIDATE2;
    cout<< "\n 3. " << CANDIDATE3;
    cout<< "\n 4. " << CANDIDATE4;
    cout<< "\n 5. None of These";
    cout<<"\n\n Select Your Favorite Candidate (1 - 4):\t ";
    cin>>choice;
    switch(choice){
        case 1: votesCount1++; break;
        case 2: votesCount2++; break;
        case 3: votesCount3++; break;
        case 4: votesCount4++; break;
        case 5: spoiledtvotes++; break;
        default:
            cout<<"\n Error: Wrong Choice !! Please retry";
            getchar();
    }
    cout<< "\n Thank You For Voting !!";
    cout<<"\n\n!!!!!!!!!!END OF VOTING!!!!!!!!!!\n\n";
}
void votesCount(){
    cout<<"\n\n !!!!!!!!!!STATISTICS!!!!!!!!!!";
    cout<<"\n "<<CANDIDATE1<<" \t- "<<votesCount1<<" ";
    cout<<"\n "<<CANDIDATE2<<" \t- "<<votesCount2<<" ";
    cout<<"\n "<<CANDIDATE3<<" \t- "<<votesCount3<<" ";
    cout<<"\n "<<CANDIDATE4<<" \t- "<<votesCount4<<" ";
    printf("\n %s \t\t- %d ", "Spoiled Votes", spoiledtvotes);
    cout<<"\n\n!!!!!!!!!!END OF THE LIST!!!!!!!!!!";
}
void getLeadingCandidate(){
    cout<<"\n\n!!!!!!!!!!RESULTS!!!!!!!!!!\n\n";
    if(votesCount1>=votesCount2 && votesCount1>=votesCount3 && votesCount1>=votesCount4)
        cout<<"Leading Candidate: ["<<CANDIDATE1<<"]";
    else if (votesCount2>=votesCount3 && votesCount2>=votesCount4 && votesCount2>=votesCount1)
        cout<<"Leading Candidate: ["<<CANDIDATE2<<"]";
    else if(votesCount3>=votesCount4 && votesCount3>=votesCount2 && votesCount3>=votesCount1)
        cout<<"Leading Candidate: ["<<CANDIDATE3<<"]";
    else if(votesCount4>=votesCount1 && votesCount4>=votesCount2 && votesCount4>=votesCount3)
        cout<<"Leading Candidate: ["<<CANDIDATE4<<"]";
    else
        cout<<"----- Warning !!! No-win situation----";
        cout<<"\n\n!!!!!!!!!!END OF LIST!!!!!!!!!!";
}
void gotoxy(int x,int y){
	y--;
	static HANDLE h=NULL;
	if(!h){
		h = GetStdHandle(STD_OUTPUT_HANDLE);
	}
	COORD c = {x,y};
	SetConsoleCursorPosition(h,c);
}
void delay(unsigned int secs){
	clock_t goal = secs +  clock();
	while(goal>clock());
}
void load(){
	CLS();
	cout<<"\n\n\n\n\t\t\t\t  Please Wait!!\n\n";
	for (int i=0;i<80;i++){
		cout<<"*";
		gotoxy(i,3);
		cout<<"*";
		cout.flush();
		gotoxy(i+1,7);
		delay((rand()%80) + 20);
	}
	cout.flush();
	delay(200);
}
int scan(){
	string ch;
	int i,v;
	do{
		v=1;
		cin>>ch;
		for(i=0;i<ch.size();i++){
			if(!isdigit(ch[i])){
				v=0;
				break;
			}
		}
	}while(!v);
	return atoi(ch.c_str());
}
int main(){
    char ch;
	char ch1;
	int ch2;
	load();
	bool login_successful = false;
    long long option, remain = 6;
    string account_name, account_name_login, password, password_login, username;

    cout<< "\n\nCATHOLIC UNIVERSITY OF ZIMBABWE S.R.C ELECTIONS 2022\n\n";
    cout<< "1. Sign Up" << endl << "2. Login" << endl << "3. Forgot Password";
    cout<< "\n\nEnter Your Choice: ";
    cin >> option;

    if (option == 1){
        cout << "\n----------VOTERS REGISTRATION-----------\n\n";
        cout << "Enter User Name: ";
        cin >> account_name;
        cout << "Enter Password: ";
        cin >> password;
        cout << endl;
        ofstream user_info;
        user_info.open("user_" + account_name + ".txt");
        user_info << account_name << endl << password;
        user_info.close();
        cout << "Your Account Has Been Created, You Can Now Login & Thank You!!";
        delay(1500);
        main();
    }
    else if (option == 2){
        do{
            cout << "\n----------VOTERS LOGIN-----------\n" << endl;
            cout << "Enter User Name: ";
            cin >> account_name_login;
            cout << "Enter Password: ";
            cin >> password_login;
            ifstream find_account("user_" + account_name_login + ".txt"); //user_Jean.txt
            getline(find_account, account_name);
            getline(find_account, password);
            if (account_name_login == account_name && password_login == password){
                cout << endl << "You have logged in successfully!" << endl << endl;
                delay(1500);
                login_successful = true;
                load();
                do{
                    CLS();
                    RULE("*");
                    cout<<"\tCATHOLIC UNIVERSITY OF ZIMBABWE S.R.C ELECTIONS 2022";
                    RULE("*");
                    cout<<"\n1. Presidential Category.\n";
                    cout<<"2. Sports and Entertainment Category.\n";
                    cout<<"0. Exit.\n\n";
                    cout<<"Enter your choice : ";
                    fflush(stdin);
                    cin>>ch1;
                    if(ch1=='1'){
                        fflush(stdin);
                        load();
                        do{
                            CLS();
                            RULE("*");
                            cout<<"\tCATHOLIC UNIVERSITY OF ZIMBABWE S.R.C ELECTIONS 2022";
                            RULE("*");
                            cout<<"\nPresidential Category\n\n";
                            cout<<"1.  Cast Your Vote.\n";
                            cout<<"2.  View Candidate Vote Count.\n";
                            cout<<"3.  View Leading Candidate.\n";
                            cout<<"0.  Exit.\n";
                            cout<<"\nEnter your choice : ";
                            ch2 = scan();
                            switch(ch2){
                                case 1:
                                    castVote();
                                    break;
                                case 2:
                                    votesCount();
                                    cout<<"\nPress 1 and enter to return to Main Menu!\n";
                                    break;
                                case 3:
                                    getLeadingCandidate();
                                    break;
                            }
                            fflush(stdin);
                            if(ch2)
                                cin>>ch;
                                else
                                load();
                            }while(ch2!=0);
                        }
                    }
                    while(ch1!='0');
            }
            else{
                cout << endl << "Invalid User Name or Password" << endl << "You have " << remain << " times left to try!" << endl << "Try again!" << endl;
                remain--;
                login_successful = false;
            }
        }
        while (!login_successful && remain != 0);
        if (remain == 0){
            cout << "You have 0 times left to try" << endl << "The program will now exit";
            Sleep(5);
            return 0;
        }
    }
    else if (option == 3){
        cout << "\n----------ACCOUNT RECOVERY-----------" << endl;
        cout << "\nUser Name: ";
        cin >> username;
        ifstream find_account("user_" + username + ".txt");
        if (find_account.is_open()){
            getline(find_account, account_name);
            getline(find_account, password);
            cout << "Your Password: " << password << endl << endl;
            delay(1500);
            main();
        }
        else{
            cout << "Account Does Not Exist!" << endl << endl;
        }
    }
}




