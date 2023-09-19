package br.digitalhouse.exericio.medicines.dao.Impl;

import br.digitalhouse.exericio.medicines.dao.ConfigurationJDBC;
import br.digitalhouse.exericio.medicines.dao.IDao;
import br.digitalhouse.exericio.medicines.model.Medicines;

import java.sql.*;

public class MedicinesDaoImpl implements IDao<Medicines> {
    private ConfigurationJDBC configurationJDBC;

    public MedicinesDaoImpl(ConfigurationJDBC configurationJDBC){
        this.configurationJDBC = configurationJDBC;
    }

    @Override
    public Medicines save(Medicines medicines){
        Connection connection = configurationJDBC.databaseConnect();
        Statement statement = null;
        String query = String.format(
                "INSERT INTO medicines(name, laboratory, amount, price) VALUES( '%s', '%s', '%s', '%s')",
                medicines.getName(),
                medicines.getLaboratory(),
                medicines.getAmount(),
                medicines.getPrice());
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if(keys.next())
                medicines.setId((keys.getInt((1))));
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medicines;
    }

    @Override
    public Medicines fetchById(Integer id){
        Connection connection = configurationJDBC.databaseConnect();
        Statement statement = null;
        String query = String.format("SELECT * FROM medicines WHERE  id = '%s", id);
        Medicines medicines = new Medicines();
        try{
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                medicines.setId(resultSet.getInt("id"));
                medicines.setName((resultSet.getString("name")));
                medicines.setLaboratory(resultSet.getString("laboratory"));
                medicines.setAmount(resultSet.getInt("amount"));
                medicines.setPrice(resultSet.getDouble("price"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

        return medicines;
    }
}
