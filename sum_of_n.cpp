#include <iostream>
using namespace std;

//Given an integer n, write a function that returns the sum of all the natural numbers from 1 to n(both included).
int sum_of_n(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
        sum+=i;
    }
    cout << sum << endl;
    return sum;
}
int main(){
    int n;
    cout << "Enter the number n to print its sum of all natural numbers:" <<endl;
    cin >> n ; 
    if(n<=0){
        cout << "are you comedying me..........Enter a natural number(from 1,2,3,4,5,.......,n)" <<endl;
    }
    else{
        sum_of_n(n);
    }
    

}

