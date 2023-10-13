use faculdade;
-- 2.Implemente uma consulta para listar o quantitativo de cursos existentes

select count(*) as NumeroCursos from curso;

-- 3.Implemente uma consulta para listar o nome das disciplinas existentes

select nome from disciplina order by nome;

/* 4.Implemente uma consulta para listar o nome de todos os cursos e o nome de seus respectivos alunos
A listagem deve ser mostrada em ordem decresente pelo nome dos cursos*/

select a.nome 'Nome do aluno', c.nome 'Nome do curso'
from alunocurso ac
inner join aluno a
on a.idAluno = ac.idAluno
inner join curso c
on c.idcurso = ac.idcurso order by c.nome desc;

/* 5.Implemente uma consulta para listar o nome das disciplinas e a média das notas das disciplinas em
todos os cursos. Para isso, utilize o comando group by.*/
select  d.nome 'Nome da disciplina', avg(H.nota) 'Nota média'
from disciplina d 
inner join historico h
on d.IdDisciplina = h.idDisciplina
group by nome order by nome;
 
 -- exibir ID e nome da disciplina
 SELECT 
    di.iddisciplina,
    d.nome AS 'Nome da disciplina',
    AVG(h.nota) AS 'Nota média'
FROM 
    disciplina d
INNER JOIN 
    historico h ON d.IdDisciplina = h.idDisciplina
INNER JOIN 
    disciplina di ON d.iddisciplina = di.iddisciplina
GROUP BY 
    di.iddisciplina, d.nome
ORDER BY 
    d.nome;


/* Implemente uma consulta parta listar o nome de todos os cursos e a quantidade de alunos em cada
curso. Para isso, utilize os comandos de join e group by.*/

select c.nome 'Nome do curso', count(ac.Idaluno) 'Número de alunos'
from curso c
inner join alunoCurso ac
on c.idCurso = ac.idCurso
group by nome;

select c.nome 'Nome do curso', count(ac.Idaluno) 'Número de alunos'
from curso c
inner join alunoCurso ac
on c.idCurso = ac.idCurso
group by nome; 
