# Movie Recommendation System
A good Movie Recommender App would primarily consist of a set of questionaire asked to the user based on which he/she would get the approriate reccomendations. <br>
Now in today's world there are several APIs already available which can be used to get the movie recommendations. <br>
[Movie App API](https://rapidapi.com/dotero27022001/api/movies-app1) is one such API which is having 9.7/10 rating and can be used for this purpose. <br>
However it comes with certain limitations:
- It can be used for only 1000 requests per day on a free account.
- Some of the Genres are not mentioned in English. To get a better understanding of which genre is denoting what refer to the following table.

| Genre (Provided) | Genre (Meaning) |
| --- | --- |
| Accion | Action |
| Aventura | Adventure |
| Animacion | Animation |
| Comedia | Comedy |
| Crimen | Crime |
| Documental | Documentary |
| Drama | Drama |
| Cienficion | Science Fiction |
| Fantasia | Fantasy |
| Foreign | Foreign |
| Guerra | War |
| Pelicula de la TV | TV Movie |
| Romance | Romance |
| Historia | History |
| Suspense | Thriller |
| Terror | Horror |
| Western | Western |
| Misterio | Mystery |

Apart from Genre a Movie can also be recommended based on year. <br>

## Usage
### Javascript (Fetch)
```
const options = {
	method: 'GET',
	headers: {
		'X-RapidAPI-Key': <YOUR_API_KEY>,
		'X-RapidAPI-Host': 'movies-app1.p.rapidapi.com'
	}
};

const link="https://movies-app1.p.rapidapi.com/api/movies?"
const genre=<YOUR GENRE>
const year=<YOUR YEAR>

const final_link=link+"genres="+genre+"&year="+year

fetch(final_link, options)
	.then(response => response.json())
	.then(response => console.log(response))
	.catch(err => console.error(err));
```
### Nodejs (Axios)
```
const axios = require("axios");

const options = {
  method: 'GET',
  url: 'https://movies-app1.p.rapidapi.com/api/movies',
  params: {year: <YOUR YEAR>,genres: <YOUR GENRE>},
  headers: {
		'X-RapidAPI-Key': <YOUR_API_KEY>,
		'X-RapidAPI-Host': 'movies-app1.p.rapidapi.com'
	}
};

axios.request(options).then(function (response) {
	console.log(response.data);
}).catch(function (error) {
	console.error(error);
});
```