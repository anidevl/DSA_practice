#include <iostream>
using namespace std;
int main(){
    int i,j;
    // add two matrices and be either square or rectagular but both are of same size
    // taking n^th row for 1st matrix
    cout<<"Please enter n^th row of first matrix:"<<endl;
    int n1;
    cin >> n1;
    // taking m^th coloumn for 1st matrix
    cout <<"Please enter m^th column for first matrix"<<endl;
    int m1;
    cin>>m1;
    // taking n^th row for 2nd matrix
    cout<<"Please enter n^th row of second matrix:"<<endl;
    int n2;
    cin >> n2;
    // taking m^th coloumn for 2nd matrix
    cout <<"Please enter m^th column for second matrix"<<endl;
    int m2;
    cin>>m2;
    if((n1!=n2) || (m1!=m2)){
        cout<<"Both matrix are of different sizes hence matrix addition can't be performed"<<endl;
    }
    else{
        int arr1[n1][m1];
        int arr2[n2][m2];
        int totarr[n1][m1];
        // entering variables in our array
        for(i=0;i<n1;i++){
            for(j=0;j<m1;j++){
                cin>>arr1[i][j];
            }
        }
        for(i=0;i<n2;i++){
            for(j=0;j<m2;j++){
                cin>>arr2[i][j];
            }
        }
        // printing array 1 and array 2
        cout<<"elements of array 1 are:"<<endl;
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                cout <<arr1[i][j] <<" ";
            }
            cout<<endl;
        }
        cout<<"elements of array 2 are:"<<endl;
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                cout <<arr2[i][j] <<" ";
            }
            cout<<endl;
        }
        // doing addition of matrices
        for(i=0;i<n1;i++){
            for(j=0;j<m1;j++){
                totarr[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        cout<<"elements of the resultant array are:"<<endl;
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                cout <<totarr[i][j] <<" ";
            }
            cout<<endl;
        }
        
    }
}