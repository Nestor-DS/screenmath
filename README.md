# Screen Match

## Project Overview 🎬📺

This project is a content management application designed to handle various types of audiovisual titles such as movies, series, and episodes. It offers functionalities to register information about titles including their name, release date, duration, and allows users to evaluate and classify these titles. Additionally, it provides the capability to search for information about titles using the OMDB (The Open Movie Database) API. The application can also generate and store information about queried titles in a JSON file.

---------

## How to Configure API 👾🐋

To configure your own API key in the project, follow these steps:

1. Sign up for the service that provides the **OMDB API**, visit their website and register for an API key.

2. Once you have obtained your API key, navigate to the project source code and locate the **MainWithSearch.java** file.

3. In the **MainWithSearch.java** file, find the variable named **apiKey**.

4. Set the value of this variable with your own API key. Ensure you adhere to the instructions and security policies provided by the API service to safeguard your key.

5. Save the changes and recompile the project if necessary.

6. You should now be able to utilize your own API key in the project to access the services provided by the API.👌
---------


## API Reference: - [OMDb API](https://www.omdbapi.com/)


#### Usage

Send all data requests to:
```http
  http://www.omdbapi.com/?apikey=[yourkey]&
```

Poster API requests:
```http
  http://img.omdbapi.com/?apikey=[yourkey]&
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |

#### Get item

```http
  GET /api/items/${id}
```

| Parameter | Default Value     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `t`      | `<empty>` | **Required**. Movie title to search for. |


---------
## Representation Diagram:
![img.png](others%2Fimg.png)

----------
## Class attributes and methods:
![classDiagram.svg](others%2FclassDiagram.svg)


