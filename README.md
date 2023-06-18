# Spring-Xml-based-Dependency-injection
In Spring, you can perform XML-based dependency injection using both constructor injection and setter injection




Here's how you can achieve these two types of dependency injection using XML configuration:


1. Constructor Injection:

   Define the beans in your XML configuration file using the bean tag.
  
   Specify the class of the bean using the class attribute.
  
   Within the bean tag, define the constructor arguments using the constructor-arg tag.
  
   Specify the value or reference for each constructor argument using the value or ref attribute, respectively.
  
![WhatsApp Image 2023-06-18 at 7 59 53 PM](https://github.com/PPC2001/Spring-Xml-based-Dependency-injection/assets/107803628/f19973f2-63bd-46a7-a723-0ebd40c4f5e4)



2. Setter Injection:

    Define the beans in your XML configuration file using the bean tag.

    Specify the class of the bean using the class attribute.

    Within the bean tag, define the properties of the bean using the property tag.

    Specify the name of the property using the name attribute.

    Set the value or reference for each property using the value or ref tag, respectively.
    
    ![WhatsApp Image 2023-06-18 at 8 05 57 PM (1)](https://github.com/PPC2001/Spring-Xml-based-Dependency-injection/assets/107803628/4864616a-7686-4d71-abdc-aaf30015863c)
