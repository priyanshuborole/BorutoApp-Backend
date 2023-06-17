
# Boruto App Backend

This repository contains the backend code for the Boruto Anime App, a web application that provides information about the Boruto anime characters. The backend is built using Ktor, a Kotlin-based asynchronous web framework.

The Boruto Anime App Backend serves as the API server for the Boruto Anime App frontend, providing endpoints to retrieve and manage anime-related data.

[![Deploy on Railway](https://railway.app/button.svg)](https://docs.railway.app/deploy/deployments)




## Installation

To install and run the Boruto Anime App Backend locally, follow these steps:

Clone the repository:

```
git clone https://github.com/priyanshuborole/BorutoApp-Backend.git
```
Navigate to the project directory:
```
cd BorutoApp-Backend
```
Build the project using Gradle:
```
./gradlew build
```
Run the server:
```
./gradlew run
```
The server will start running on http://127.0.0.1:8080/.

    
## Usage
Once the server is up and running, you can interact with the API using tools like cURL, Postman, or any other HTTP client.

The Boruto Anime App Backend provides various API endpoints to access and manage anime-related data. Refer to the API Endpoints section for more information about the available endpoints.
## Api Endpoints
- `GET /boruto/heroes` -  Fetches a list of Boruto anime characters.
- `GET /boruto/heroes?page=:page` -  Fetches a list of Boruto anime characters for particular page.
- `GET /boruto/heroes/search?name=:name` -  Fetches a list of Boruto anime characters according to search query. 
## Plugins

[Generate Ktor Project](https://start.ktor.io/#/settings) - You can create a Ktor project in two simple step: enter your project name and click Add plugins to select the plugins you need. You can also fine-tune the settings of your project.

Following plugins are used in the project
- Default Headers: The default headers plugin in Ktor allows you to set common HTTP headers for all outgoing responses from your application, ensuring consistent header values across requests.

- Content Negotiation: The content negotiation plugin provides built-in support for handling different content types (JSON, XML, etc.) based on the client's requested content type, making it easier to process and respond with the appropriate data format.

- Serialization: The serialization plugin in Ktor integrates with kotlinx.serialization library, enabling automatic serialization and deserialization of data classes to and from various formats like JSON, XML, and others.

- Routing: The routing plugin in Ktor allows you to define and handle HTTP routes and their corresponding handlers, enabling you to create the API endpoints and define the logic for processing incoming requests.

- Koin: Koin is a dependency injection framework for Kotlin. The Koin plugin integrates Koin into your Ktor application, enabling you to easily manage and inject dependencies into your application components, such as routes or services.


## Contributing
Contributions to the Boruto App Backend project are welcome! If you would like to contribute, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them with descriptive commit messages.
4. Push your changes to your forked repository.
5. Submit a pull request to the main branch of the original repository.   

Please ensure that your code adheres to the project's coding style and conventions.


