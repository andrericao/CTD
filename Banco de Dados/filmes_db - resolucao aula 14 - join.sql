select titulo as Séries, nome as Gêneros
from series, generos
where series.genero_id = generos.id;
