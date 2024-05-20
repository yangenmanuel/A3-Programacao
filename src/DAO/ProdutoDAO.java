/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Produto;

import java.sql.*;
import java.util.ArrayList;

public class ProdutoDAO {

    Connector connector = new Connector();
    ArrayList<Produto> Lista;

    // Read do CRUD
    public ArrayList<Produto> ListarProdutos() {

        Lista = new ArrayList<Produto>();

        try {
            Statement stmt = connector.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_products");

            while (res.next()) {

                int product_id = res.getInt("product_id");
                String name = res.getString("name");
                String description = res.getString("description");
                int stock = res.getInt("stock");
                double price = res.getDouble("price");
                Timestamp date_registered = res.getTimestamp("date_registered");

                Produto objeto = new Produto(product_id, name, description, stock, price,
                        date_registered);

                Lista.add(objeto);
            }

            stmt.close();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }

        return Lista;
    }

    // Insert do CRUD
    public boolean InserirProduto(Produto produto) {

        String sql = "INSERT INTO tb_products (name, description, stock, price, date_registered) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = connector.getConexao().prepareStatement(sql);

            stmt.setString(1, produto.getName());
            stmt.setString(2, produto.getDescription());
            stmt.setInt(3, produto.getStock());
            stmt.setDouble(4, produto.getPrice());
            stmt.setTimestamp(5, produto.getDate_registered());

            stmt.execute();
            stmt.close();

            return true;
        }
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    // Update do CRUD
    public boolean AlterarProduto(Produto produto) {

        String sql = "UPDATE tb_products SET name = ?, description = ?, stock = ?, price = ? WHERE product_id = ?";

        try {
            PreparedStatement stmt = connector.getConexao().prepareStatement(sql);

            stmt.setString(1, produto.getName());
            stmt.setString(2, produto.getDescription());
            stmt.setInt(3, produto.getStock());
            stmt.setDouble(4, produto.getPrice());
            stmt.setInt(5, produto.getProduct_id());

            stmt.execute();
            stmt.close();

            return true;
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }  

    // Delete do CRUD
    public boolean ExcluirProduto(int product_id){

        try {
            Statement stmt = connector.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_products WHERE id = " + product_id);

            stmt.close();
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }

        return true;
    }
}