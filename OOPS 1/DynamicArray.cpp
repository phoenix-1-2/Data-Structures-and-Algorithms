class DynamicArray{
    int *arr;
    int index;
    int sizeOfArray;

    void doubleCapacity(){

        int * temp = arr;
        this->arr = new int[sizeOfArray* 2];

        for(int i=0;i<sizeOfArray;i++){
            arr[i] = temp[i];
        }
        this->sizeOfArray*=2;
        delete [] temp;
    }

    public:

    DynamicArray(int sizeOfArray = 5){
        this->sizeOfArray = sizeOfArray;
        this->index = -1;
        this->arr = new int[sizeOfArray];
    }

    DynamicArray( DynamicArray const &arr ){

        this->sizeOfArray = arr.sizeOfArray;
        this->index =arr.index;

        delete [] this->arr;
        this-> arr = new int[this->sizeOfArray];

        for(int i=0;i< sizeOfArray ; i++ ){
            this->arr[i] = arr.arr[i];
        }

    }

    void operator=(DynamicArray const &arr){

        this->sizeOfArray = arr.sizeOfArray;
        this->index =arr.index;
        delete [] this->arr;
        this-> arr = new int[this->sizeOfArray];

        for(int i=0;i< sizeOfArray ; i++ ){
            this->arr[i] = arr.arr[i];
        }

    }
    void add(int i , int data){
        if(i > size()){
            return ; 
        }
        if(i == size()){
            this->add(data);
        }
        this->arr[i] = data;
    }

    int size() const{
        return index + 1;
    }
    bool isEmpty() const{
        return size() == 0;
    }
    void add(int data){

        if(size() == sizeOfArray){
            doubleCapacity();
        }
        index++;
        arr[index]  = data;
    }

    int removeLast(){
        if(size()==0){
            return INT_MIN;
        }
        int temp = arr[index];
        index--;
        return temp;
    }
    int get(int i) const{
        if(size()==0){
            return INT_MIN;
        }
        return arr[i];
    }

    void print() const{
        cout << "Size :" << this->size()<<endl; 
        for(int i=0;i<this->size();i++){
            cout << this->arr[i] << " ";
        }
        cout<< endl;
    }
};