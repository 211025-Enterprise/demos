import { useState, useEffect } from "react";
import axios from "axios";

let pokemonClient = axios.create({
  baseURL: "https://pokeapi.co/api/v2/",
  headers: {
    "Content-Type": "application/json",
  },
});

// performed an auth request to localhost:8080/login -> jwt

// let jwt;

// let authClient = axios.create({
//     baseURL: "localhost:8080",
//     headers: {
//         "Content-Type" : "application/json",
//         "Authorization": `Bearer ${jwt}` // fujghiujnerfiusnfoiunweroiunbsifuoghddfhgfdtghdgfh
//     }
// })

export const Pokemon = () => {
  let [data, setData] = useState(undefined);
  let [pokeName, setPokeName] = useState(undefined);

  function getData() {
    pokemonClient.get(`pokemon/${pokeName}`).then((resp) => {
      setData(resp.data);
    });
  }

  function nameChange(e) {
    e.preventDefault();
    setPokeName(e.target.value);
  }

  useEffect(getData, [pokeName]); // empty dependencies? Only invoke the callback onComponentMount

  return (
    <>
      <input type="text" value={pokeName} onChange={nameChange} />
      <br />
      <br />
      {data ? <PokeDisplay data={data} /> : <h3>Loading...</h3>}
    </>
  );
};

function PokeDisplay({ data }) {
  return (
    <>
      <img src={data.sprites.front_shiny} />
      <h4>Name: {data.name}</h4>
      <h5>Weight: {data.weight}</h5>
    </>
  );
}
