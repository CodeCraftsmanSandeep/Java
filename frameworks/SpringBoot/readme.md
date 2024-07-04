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

# Key words
- Spring initilizer : https://start.spring.io/