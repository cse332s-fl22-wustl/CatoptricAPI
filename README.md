## Usage
It should be used with appropriate hardware set up, for detail: see Professor Chamberlain
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

Before run:
export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:~/ResearchCode/catoptric_cpp

Testing move:
curl -X POST -H "Content-Type: application/json" -d '{"motor": 1, "steps": 1, "row": 1, "column": "2", "surface": "0"}' http://localhost:8080/move