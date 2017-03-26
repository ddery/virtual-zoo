CC=g++
CFLAGS=-c -Wall
LDFLAGS=-std=c++11
SOURCES=main.cpp src/driver.cpp src/animal.cpp src/cage.cpp src/cell.cpp src/zoo.cpp 
OBJECTS=$(SOURCES:.cpp=.o)
EXECUTABLE=main

all: $(SOURCES) $(EXECUTABLE)
    
$(EXECUTABLE): $(OBJECTS) 
	$(CC) $(LDFLAGS) $(OBJECTS) -o $@

.cpp.o:
	$(CC) $(CFLAGS) $< -o $@
clean:
	rm -f *.o src/*.o