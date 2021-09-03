#include <iostream>

using namespace std;

#include <climits>
#include "DynamicArray.cpp"

int main(){

    DynamicArray arr;
    for(int i=0;i<10;i++){
        arr.add(i);
    }
    cout << "ARR 1 : " << endl;
    arr.print();

    const DynamicArray arr2(arr);
    cout << "ARR 2: " << endl;
    arr2.print();

    // arr.add(1000);
    arr.add( arr.size() , 1000 );
    // arr2 = arr;
    // arr2.add(2,99);
    cout << "ARR 2 : " << endl;
    arr2.print();
    cout << "ARR 1 : " << endl;
    arr.print();

    // cout<<"Size Initily : "<< arr.size()<<endl;

    // while(!arr.isEmpty()){
    //     cout<<arr.removeLast()<<endl;
    // }
    // cout<<"Size Final : "<< arr.size()<<endl;
    // for(int i=0;i<arr.size();i++){
    //     cout<<arr.get(i)<<endl;
    // }

}
