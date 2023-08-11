package clinic.persistence;

import clinic.entities.Dentist;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class DentistDaoMemory implements IDao<Dentist>{

    private final static Logger LOGGER = Logger.getLogger(DentistDaoMemory.class);
    private final List<Dentist> dentistsList = new ArrayList<>();


    @Override
    public void createTable() {
    }

    @Override
    public Dentist insert(Dentist dentist) {
        dentistsList.add(dentist);
        LOGGER.info("Data successfully inserted in memory, dentist: " + dentist.surname() + ", license number: " + dentist.licenseNumber());
        return dentist;
    }

    @Override
    public List<Dentist> selectAll() {
        dentistsList.forEach(LOGGER::info);
        LOGGER.info("Retrieving data from the memory...");
        return dentistsList;
    }
}