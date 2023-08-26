import React from 'react';
import './post.module.css';
import '../App.css';

export default function Post(){

	return (
	<>
		<div className={styles.listContainer}>
            <ul>
        		{groceryList && (
                groceryList.map((grocery, index) => {
                return (
                    <Card
                    	key={index}
                    	grocery={grocery}
                    	toggleGroceryBoughtStatus={() => toggleGroceryBoughtStatus(grocery)}
                    />
                )
                })
            )}
        	</ul>
		</div>
	</>
	);
}