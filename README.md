## Usage
It should be used with appropriate hardware set up, for detail: see Professor Chamberlain

Before run:
The API calls the C library of Catoptric CPP, so we must include Catoptric CPP's shared library into our LD Libraries:
    ```
    export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:<path to the CatoptircAPI repo>
    ```
To Start the server:
    ```
    cd CatoptricServer
    ./gradlew run
    ```


## CodeDirectory
The following files contain the code you should be concerned with:
1. Micronaut server controller that handles http request and calls Python script:
    ```
    /CatoptricServer/src/main/java/codes/recursive/controller/DefaultController.java
    ```
2. Micronaut files related to JNI are all in this directory:
    ```
    CatoptricAPI/CatoptricServer/src/main/java/JNI/
    ```
    
# JNI Tutorial
https://www3.ntu.edu.sg/home/ehchua/programming/java/javanativeinterface.html


Testing move:
curl -X POST -H "Content-Type: application/json" -d '{"motor": 1, "position": 1, "row": 1, "column": "2", "surface": "0"}' http://localhost:8080/move
