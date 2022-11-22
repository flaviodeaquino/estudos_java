package controller;

import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TaskController  {

    public void save(Task Task) {

    }

    public void update(Task task) {

    }

    public void removeById(int taskId) throws SQLException {

        String sql = "DELETE FROM tasks WHERE id = ?";

        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, taskId); // substitui o primeiro interrogação da variavel sql pelo valor de taskId.
            statement.execute();
        } catch (SQLException e) {
            throw new SQLException("Erro ao excluir a tarefa");
        } finally {
            ConnectionFactory.closeConnection(conn);
        }

    }

    public List<Task> getAll(int idProject) {
        return null;
    }

}
