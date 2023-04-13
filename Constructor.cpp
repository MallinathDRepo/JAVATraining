#include<stdio.h>
#include<iostream>

class parentA{
    public:
        parentA(){
        	std::cout<<"******************************************************* \n";
            std::cout<<"I am default constructor of ParentA \n";
		}
         ~parentA(){
        	std::cout<<"I am desctructor of parentA \n";
   		}
};
class childB : public parentA{
public:
    childB(){
        std::cout<<"I am constructor of childB from Parent A \n";
    }
    ~childB(){
        std::cout<<"I am desctructor of childB\n";
    }
};

class childC : public parentA{
public:
    childC(){
        std::cout<<"I am constructor of childC from Parent A \n";
    }
    ~childC(){
        std::cout<<"I am Destructor of childC \n";
    }
};

class childD : public childB{
public:
    childD(){
        std::cout<<"I am constructor of childD from ChildB \n";
    }
    ~childD(){
        std::cout<<"I am Destructor of childD \n";
    }
};
class childE : public childB{
public:
    childE(){
        std::cout<<"I am constructor of childE from ChildB \n";
    }
    ~childE(){
        std::cout<<"I am destructor of childE \n";
    }
};

class childH : public childD, public childE{
public:
    childH(){
        std::cout<<"I am constructor of childH from ChildD and ChildE \n";
    }
    ~childH(){
        std::cout<<"I am destructor of childH \n";
    }
};

class childF : public childC{
public:
    childF(){
        std::cout<<"I am constructor of childF from ChildC \n";
    }
    ~childF(){
        std::cout<<"I am destructor of childF \n";
    }
};
class childG : public childC{
public:
    childG(){
        std::cout<<"I am constructor of childG from ChildC \n";
    }
    ~childG(){
         std::cout<<"I am destructor of childG \n";
    }
};

class childI : public childF, public childG{
public:
    childI(){
        std::cout<<"I am constructor of childI from ChildF and ChildG \n";
    }
    ~childI(){
         std::cout<<"I am destructor of childI \n";
    }
};

class childJ : public childH, public childI{
public:
    childJ(){
        std::cout<<"I am constructor of childJ from ChildH and ChildI \n\n\n";
        std::cout<<"**************** Desctructos ********************** \n";
    }
    ~childJ(){
         std::cout<<"I am destructor of childJ \n";
    }
};


int main(){
    childJ j;
}

