package products;

import java.util.ArrayList;
public class PetService {
    private PetDao petDao = new PetDao();

    public PetService() {
    }

    public Pet findPet(int id) {
        return petDao.findById(id);
    }

    public void savePet(Pet pet) {
        petDao.save(pet);
    }

    public void deletePet(Pet pet) {
        petDao.delete(pet);
    }

    public void updatePet(Pet pet) {
        petDao.update(pet);
    }

    public ArrayList<Pet> findAllPets() {
        return petDao.findAll();
    }
}

