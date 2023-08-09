import React from 'react';

function Post(props){

	//let qtdComentarios = 101;
	let listaDeComentarios = ["Comentarios 1", "Comentarios 2"];

	return (
	<>
		<p>{props.post /*Sou um post.*/}</p>
		<p>Comentários({props.qtdComentarios})</p>

		<ul>
			{listaDeComentarios.map(comentario => <li>{comentario}</li>)}
		</ul>
	</>
	)
}

export default Post;