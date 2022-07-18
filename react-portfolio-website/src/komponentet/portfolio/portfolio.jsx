import React from 'react'
import "./portfolio.css"
import Img from '../../asetet/3.jpg'
import Img1 from '../../asetet/youtube_clone.png'
import Img2 from '../../asetet/coffee.jpg'
import Img3 from '../../asetet/tve.jpg'
import Img4 from '../../asetet/hotel.png'


const data =[
   {
   id:1,
   image:Img,
   title:'Construction Website',
   github:'https://github.com/Dardi2205/dardankaraxha.github.io/tree/main/Projekti'
},
{
   id: 2,
   image:Img1,
   title:'Youtube Clone',
   github:'https://github.com/Dardi2205/dardankaraxha.github.io/tree/main/Projekti2'


},

{
id:3,
image:Img2,
title:'Coffee Website',
github:'https://github.com/Dardi2205/dardankaraxha.github.io/tree/main/coffe',
demo:'https://freewebsitehostingdemo-70793.web.app/'
},
{
   id:4,
   image:Img3,
   title:'E-Commerc Website',
   github:'',
   demo:'http://localhost/brackets/projketii/'
},
{
   id:5,
   image:Img4,
   title:'Java Gui Hotel Menagment',
   github:'https://github.com/Dardi2205/dardankaraxha.github.io/tree/main/Hotel%20Menagmen'
}
]


const Portfolio = () => {
  return (
   <section id="portfolio">
   <h5>My Recent Work</h5>
   <h2>Portfolio</h2>

   <div className="container portfolio__container">
    

{
   data.map(({id,image,title,github,demo}) => {
      return (

         <article key={id} className="portfolio_item">
         <div className="portfolio_image">
      <img src={image} alt={title} />
         </div>
         <h3>{title}</h3>
         <div className='portfolio-cta'>
          <a href={github}className='btn'target="_blank">GitHub</a>
          <a href={demo}className='btn btn-primary'target="_blank">Live Demo</a>
          </div>
          </article>
      


      )
   })
}


   </div>
   

    </section>
  )
}

export default Portfolio
