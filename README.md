<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>TakeALot-OnlineOrderingSystem</title>
</head>
<body>

<h1>📦 TakeALot Online Ordering System</h1>
<p>A Spring Boot-based backend application for managing customers, products, and orders. This system allows users to create and manage orders while tracking customers and products.</p>

<h2>📋 Features</h2>
<ul>
  <li>Manage customers (add, update, view, and delete)</li>
  <li>Manage products (add, update, view, and delete)</li>
  <li>Create and manage orders</li>
  <li>Track total prices for orders</li>
</ul>

<h2>🛠️ Setup Instructions</h2>

<h3>Prerequisites</h3>
<ul>
  <li>Java 17 or higher</li>
  <li>IntelliJ IDEA or any preferred Java IDE</li>
  <li>Postman or any API testing tool</li>
</ul>

<h3>Steps to Run</h3>
<ol>
  
  <li>Open the project in IntelliJ IDEA.</li>
  <li>Ensure all necessary dependencies are installed (Spring Web, Spring Data JPA, H2 Database).</li>
  <li>Run the application from the main class.</li>
  <li>Access the API at <code>http://localhost:8080/api</code>.</li>
</ol>

<h2>📚 API Endpoints</h2>

<h3>Customers</h3>
<ul>
  <li><code>GET /api/customers</code>: Retrieve all customers</li>
  <li><code>GET /api/customers/{id}</code>: Retrieve a specific customer by ID</li>
  <li><code>POST /api/customers</code>: Add a new customer</li>
  <li><code>PUT /api/customers/{id}</code>: Update an existing customer</li>
  <li><code>DELETE /api/customers/{id}</code>: Delete a customer</li>
</ul>

<h3>Products</h3>
<ul>
  <li><code>GET /api/products</code>: Retrieve all products</li>
  <li><code>GET /api/products/{id}</code>: Retrieve a specific product by ID</li>
  <li><code>POST /api/products</code>: Add a new product</li>
  <li><code>PUT /api/products/{id}</code>: Update an existing product</li>
  <li><code>DELETE /api/products/{id}</code>: Delete a product</li>
</ul>

<h3>Orders</h3>
<ul>
  <li><code>GET /api/orders</code>: Retrieve all orders</li>
  <li><code>GET /api/orders/{id}</code>: Retrieve a specific order by ID</li>
  <li><code>POST /api/orders</code>: Create a new order</li>
  <li><code>DELETE /api/orders/{id}</code>: Delete an order</li>
</ul>

<h2>🔗 H2 Database Console</h2>
<p>The application uses an in-memory H2 database. Access the database console at <code>http://localhost:8080/h2-console</code>.</p>
<p><strong>Database Credentials:</strong></p>
<ul>
  <li><strong>JDBC URL:</strong> <code>jdbc:h2:mem:orderdb</code></li>
  <li><strong>Username:</strong> <code>sa</code></li>
  <li><strong>Password:</strong> <code>password</code></li>
</ul>

<h2>🤝 Contributing</h2>
<p>Feel free to fork this repository and submit pull requests for improvements or new features.</p>

<h2>📄 License</h2>
<p>This project is licensed under the MIT License.</p>



</body>
</html>
