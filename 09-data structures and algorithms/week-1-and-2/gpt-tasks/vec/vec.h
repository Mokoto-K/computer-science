class Vec{

public:
    Vec();
    Vec(int);
    Vec& operator=(const Vec&);
    ~Vec();

private:
    
    int limit;
    double* pointer_to_data;
};

    
    
