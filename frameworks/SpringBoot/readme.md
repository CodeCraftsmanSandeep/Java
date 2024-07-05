- Dependency injection
- Dependency Injection (DI) is a design pattern used in software development to achieve Inversion of Control (IoC) between classes and their dependencies. Instead of a class creating its own dependencies, they are injected into the class, typically through the constructor, method parameters, or properties
- Inversion of Control (IoC):
  - IoC is a principle in software design where the control of object creation and management is transferred from the object itself to a container or framework. DI is one of the ways to achieve IoC.
- Bean factory in SpringBoot
  - The BeanFactory provides the basic functionality for managing beans, including the creation, configuration, and management of the lifecycle of beans.
  - Key Concepts of BeanFactory
    - **Bean Definition**:
      - A bean definition describes how a bean should be instantiated, configured, and managed by the Spring container. It includes information like the class of the bean, its properties, constructor arguments, and other configuration details.
    - **Lazy Initialization**:
      - By default, BeanFactory initializes beans lazily. This means that a bean is not created until it is requested. This can be contrasted with ApplicationContext, which generally initializes beans eagerly at startup.
    - **Dependency Injection**:
      - BeanFactory supports dependency injection by resolving and injecting the necessary dependencies into beans.
    - **Lifecycle Management**:
      - BeanFactory manages the lifecycle of beans, including initialization and destruction callbacks.
- Web services
  - REST web services
    - REST (Representational State Transfer) is an architectural style that uses standard HTTP methods for communication. It's designed to be simple, scalable, and stateless.
  - SOAP web services
    - SOAP (Simple Object Access Protocol) is a protocol for exchanging structured information in the implementation of web services. It relies on XML-based messaging and is designed for more complex interactions.
  - Comparison
    - Complexity: REST is simpler and more flexible compared to SOAP, which is more rigid and requires more setup.
    - Data Format: REST typically uses lightweight formats like JSON, while SOAP uses XML.
    - Use Case: REST is generally preferred for web APIs and services where simplicity, performance, and scalability are important. SOAP is preferred for enterprise-level applications that require a high level of security and transactional reliability.

- ### HTTP Protocol

**HTTP (HyperText Transfer Protocol)** is the foundational protocol used for transmitting data on the World Wide Web. It defines how messages are formatted and transmitted, and how web servers and browsers should respond to various commands.

#### Key Characteristics of HTTP

1. **Stateless Protocol**: Each HTTP request from a client to server is independent, meaning that the server does not retain any state or information about previous requests. This makes HTTP simple but also means that each request must contain all necessary information.

2. **Request-Response Model**: HTTP operates based on a request-response model. The client (typically a web browser) sends a request to the server, which processes it and sends back a response.

3. **Methods (Verbs)**: HTTP defines a set of request methods that indicate the desired action to be performed for a given resource:
   - **GET**: Retrieve data from the server. This method should not alter the state of the server.
   - **POST**: Send data to the server to create a new resource.
   - **PUT**: Send data to the server to update an existing resource.
   - **DELETE**: Remove a resource from the server.
   - **HEAD**: Similar to GET, but it retrieves only the headers without the body.
   - **OPTIONS**: Describe the communication options for the target resource.
   - **PATCH**: Apply partial modifications to a resource.

4. **URLs (Uniform Resource Locators)**: HTTP uses URLs to identify resources. A URL specifies the location of a resource on the web and can include the protocol, domain, path, and query parameters.

5. **Headers**: Both HTTP requests and responses use headers to convey metadata. Headers provide additional information such as content type, content length, authentication credentials, and more.

6. **Status Codes**: HTTP responses include status codes to indicate the outcome of the request. Common status codes include:
   - **200 OK**: The request was successful.
   - **201 Created**: The request was successful and a new resource was created.
   - **400 Bad Request**: The server could not understand the request due to invalid syntax.
   - **401 Unauthorized**: Authentication is required and has failed or not been provided.
   - **404 Not Found**: The requested resource could not be found.
   - **500 Internal Server Error**: The server encountered an unexpected condition.

#### HTTP/1.1 vs. HTTP/2 vs. HTTP/3

- **HTTP/1.1**: The most widely used version for many years, introducing persistent connections and chunked transfer encoding.
- **HTTP/2**: Introduced multiplexing (allowing multiple requests and responses to be sent simultaneously over a single connection), header compression, and server push capabilities for better performance.
- **HTTP/3**: The latest version, which uses QUIC (a transport protocol based on UDP) for improved performance and security, reducing latency and connection setup times.

#### Security: HTTPS

- **HTTPS (HyperText Transfer Protocol Secure)**: An extension of HTTP that uses SSL/TLS to encrypt data between the client and server, ensuring secure communication.

#### Example of an HTTP Request and Response

- **Request:**
  ```plaintext
  GET /index.html HTTP/1.1
  Host: www.example.com
  User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36
  Accept-Language: en-US,en;q=0.9
  ```

- **Response:**
  ```plaintext
  HTTP/1.1 200 OK
  Content-Type: text/html; charset=UTF-8
  Content-Length: 138
  Connection: keep-alive
  
  <!DOCTYPE html>
  <html>
  <head>
    <title>Example</title>
  </head>
  <body>
    <h1>Hello, world!</h1>
  </body>
  </html>
  ```

Understanding the HTTP protocol is essential for web development, as it underpins the communication between web browsers and servers, enabling the exchange of web pages, APIs, and other resources.

# Key words
- Spring initilizer : https://start.spring.io/