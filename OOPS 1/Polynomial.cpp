#include <climits>
#include <iostream>
using namespace std;

class Polynomial{

    private : 
    int capacity ; 

    void increaseCapacity(int index){

        int * temp = this->degCoeff;

        this->degCoeff = new int[index + 1];

        for(int i=0;i < index + 1 ; i++){
            degCoeff[i] = 0;
        }

        for(int i= 0 ; i < this->capacity ; i++){
            this->degCoeff[i] = temp[i];
        }

        this->capacity = index + 1;
        delete [] temp;

    }

    public :
    int *degCoeff;

    Polynomial(){
        degCoeff = new int[5];
        for(int i=0;i < 5 ; i++){
            degCoeff[i] = 0;
        }

        capacity = 5;
    }

    Polynomial(Polynomial const &polynomial){

        this->capacity = polynomial.capacity;

        this->degCoeff = new int[this->capacity];

        for(int i=0; i < polynomial.capacity;i++){
            setCoefficient(i , polynomial.degCoeff[i]) ;
        }

    }

    void operator=(Polynomial const &polynomial){

        this->capacity = polynomial.capacity;

        delete [] this->degCoeff ;

        this->degCoeff = new int[this->capacity];

        for(int i=0; i < polynomial.capacity;i++){
            setCoefficient(i , polynomial.degCoeff[i]) ;
        }


    }

    void setCoefficient(int index , int data){

        if(index >= this->capacity){
            increaseCapacity(index);
        }

        this->degCoeff[index] = data;

    }

    Polynomial operator+(Polynomial const &p){

        Polynomial ans ;

        int i=0 , j = 0 ;

        while(i < p.capacity && j < this->capacity ){
            ans.setCoefficient( i , p.degCoeff[i] + this->degCoeff[j] );
            i++;
            j++;
        }

        while(i < p.capacity){
            ans.setCoefficient( i , p.degCoeff[i]);
            i++;
        }
        while(j < this->capacity ){
            ans.setCoefficient( j , this->degCoeff[j] );
            j++;
        }

        return ans;

    }


    Polynomial operator-(Polynomial const &p){

        Polynomial ans ;

        int i=0 , j = 0 ;

        while(i < p.capacity && j < this->capacity ){
            ans.setCoefficient( i , - p.degCoeff[i] + this->degCoeff[i] );
            i++;
            j++;
        }

        while(i < p.capacity){
            ans.setCoefficient( i , - p.degCoeff[i]);
            i++;
        }
        while(j < this->capacity ){
            ans.setCoefficient( j , this->degCoeff[j] );
            j++;
        }

        return ans;

    }


    Polynomial operator*(Polynomial const &p){

        Polynomial ans ;

        for(int i=0;i<this->capacity;i++){
            for(int j=0;j<p.capacity;j++){

                if(  i + j < ans.capacity ){

                    ans.setCoefficient( i+j , ans.degCoeff[i+j] + this->degCoeff[i] * p.degCoeff[j] );

                }
                else{
                    ans.setCoefficient( i+j , this->degCoeff[i] * p.degCoeff[j] );

                }

            }
        }
        return ans;
    }



    void print() const{
        for(int i=0; i < this->capacity;i++){
            if(this->degCoeff[i] !=0){
                cout << degCoeff[i] << "x" << i<<" ";
            }
        }
       cout<<endl;

    }






};