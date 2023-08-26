import React from "react";
import Post from './Post';
import styles from './form.module.css';

export default function Form(){

	const [cardList, setCardList] = useState([]);
	const [cardName, setCardName] = useState('');
	const [cardAmount, setCardAmount] = useState(0);

	const handleCardSubmit = (event) => {
	event.preventDefault();

	const newCard = { name: cardName, amount: cardAmount, isBought: false };
	setCardList((OldcardList) => [...OldcardList, newCard]);
	}

	const toggleCardBoughtStatus = (cardToBeToggled) => {
		const listWithToggledStatus = cardList.map(card => {
			if (cardToBeToggled === card) {
			card.isBought = !card.isBought
			}
				return card
			});
		setCardList(listWithToggledStatus);
	}
	return (
		<>
			<form className={styles.FormContainer} onSubmit={handleCardSubmit}>
				<h3>Adicionar Nova Cor</h3>
				<div>
					<label htmlFor="">Nome</label>
					<input
						type="text"
						name='cardName'
						id='cardName'
						placeholder='Type the card name'
						onChange={(event) => setCardName(event.target.value)}
						value={cardName}
					/>
				</div>
				<div>
					<label htmlFor="">Cor</label>
					<input
						type="number"
						name='cardAmount'
						id='cardAmount'
						placeholder='Type the card amount'
						onChange={(event) => setCardAmount(event.target.value)}
						value={cardAmount}
					/>
				</div>
				<button
					type="submit"
					disabled={cardName === ''}
				>Add
				</button>
			</form>
			<section className={styles.listSection}>
        <h3>My cards</h3>
        <div className={styles.listContainer}>
            <ul>
            {cardList && (
                cardList.map((card, index) => {
                return (
                    <Post
                    key={index}
                    grocery={card}
                    toggleCardBoughtStatus={() => toggleCardBoughtStatus(card)}
                    />
                )
                })
            )}
            </ul>
        </div>
        </section>
		</>
	)
}