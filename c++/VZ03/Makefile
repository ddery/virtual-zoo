CC=g++
CFLAGS=-c -std=c++11
LDFLAGS=
SOURCES=main.cpp src/animal.cpp src/cage.cpp src/cell.cpp src/zoo.cpp src/CellType/air_habitat.cpp src/CellType/land_habitat.cpp src/CellType/park.cpp src/CellType/restaurant.cpp src/CellType/road.cpp src/CellType/water_habitat.cpp src/AnimalType/aves.cpp src/AnimalType/flying_animal.cpp src/AnimalType/land_animal.cpp src/AnimalType/mamalia.cpp src/AnimalType/pisces.cpp src/AnimalType/reptil.cpp src/AnimalType/water_animal.cpp src/AnimalType/amphibia.cpp src/AnimalType/Species/bunglon.cpp src/AnimalType/Species/burung_unta.cpp src/AnimalType/Species/cendrawasi.cpp src/AnimalType/Species/elang.cpp src/AnimalType/Species/flamingo.cpp src/AnimalType/Species/gajah.cpp src/AnimalType/Species/goliath_frog.cpp src/AnimalType/Species/gorila.cpp src/AnimalType/Species/harimau.cpp src/AnimalType/Species/komodo.cpp src/AnimalType/Species/kucing.cpp src/AnimalType/Species/lumba_lumba.cpp src/AnimalType/Species/merak.cpp src/AnimalType/Species/monyet.cpp src/AnimalType/Species/orangutan.cpp src/AnimalType/Species/panda.cpp src/AnimalType/Species/pari.cpp src/AnimalType/Species/paus_humpback.cpp src/AnimalType/Species/pinguin.cpp src/AnimalType/Species/puma.cpp src/AnimalType/Species/salmon.cpp src/AnimalType/Species/simpanze.cpp src/AnimalType/Species/singa.cpp src/AnimalType/Species/salamander.cpp src/driver.cpp src/CellType/entrance.cpp src/CellType/exit.cpp
OBJECTS=$(SOURCES:.cpp=.o)
EXECUTABLE=main

all: $(SOURCES) $(EXECUTABLE)
    
$(EXECUTABLE): $(OBJECTS) 
	$(CC) $(LDFLAGS) $(OBJECTS) -o $@

.cpp.o:
	$(CC) $(CFLAGS) $< -o $@
clean:
	rm -f *.o src/*.o src/AnimalType/*.o src/CellType/*.o src/AnimalType/Species/*.o 
