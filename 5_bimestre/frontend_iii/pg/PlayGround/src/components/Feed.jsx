import React from 'react';
import Post from './Post';

function Feed(){
	return (
	<>
		<Post post="Post 1" qtdComentarios="100"/>
		<Post post="Post 2" qtdComentarios="120"/>
		<Post post="Post 3" qtdComentarios="140"/>
		<Post post="Post 4" qtdComentarios="160"/>
	</>
	)
}

export default Feed;
