#include <iostream>
using namespace std;
int main(){
    // Find numbers in an array that is pair sum of the given number by the user
    int i,j,x,lenarr,num;
    int arr[5]={2,4,6,8,10};
    cout << "Please enter your Number to find its pair sum in our given array:";
    cin>>x;
    // finding array size
    lenarr=sizeof(arr)/sizeof(arr[0]) ;
    // printing original array
    for(i=0;i<lenarr;i++){
        cout << "our array at " << i <<" is: " << arr[i] << "\n";
    }
    // finding pair sum
    for(i=0;i<lenarr;i++){
        for(j=0;j<lenarr;j++){
            if(x==(arr[i]+arr[j])){
                cout<<" "<<arr[i]<<"+"<<arr[j]<<"="<<x<<"\n";
            }
        }
    }
}