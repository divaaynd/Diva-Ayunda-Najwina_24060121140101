/**
 * File      : DAOManager.java		31/05/23
 * Penulis   : Diva Ayunda Najwina / 24060121140101
 * Deskripsi : pengelola DAO dalam program
 *
 */

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}