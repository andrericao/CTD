function manipularVisibilidadeMenu()
{
  let body = document.querySelector('#body');
  let titulo = document.querySelector('h1');
  //let cards = document.querySelectorAll('div > .item');
  let cards = document.getElementsByClassName('item');
  let titulosH2 = document.querySelectorAll('h2');
  let paragrafos = document.querySelectorAll('.item p');



  body.classList.toggle('body-dark');
  titulo.classList.toggle('titulo-dark');

  for( let i = 0; i < cards.length; i++ )
  {
    cards[i].classList.toggle('item-dark');
  }

  for( let i = 0; i < titulosH2.length; i++ )
  {
    titulosH2[i].classList.toggle('h2-dark');
  }

  for( let i = 0; i < paragrafos.length; i++ )
  {
    paragrafos[i].classList.toggle('p-dark');
  }

}