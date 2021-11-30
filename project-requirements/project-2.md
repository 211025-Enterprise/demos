# Project 2

With Project 1 out of the way, it's time to work as a group to build your first full-stack application! No holding back on this one, every bit of abstraction we've covered is at your disposal!

## High-Level Requirements

Application must leverage the full stack: 
- RDBMS for persistence 
- API built with Java 8 and Spring 5
- First iteration of the UI is due on December 10th and will be built with HTML, CSS and JS.
- Second and findal iteration of the UI is due with the presentation on December 17 and will be built with React.

Technology framework requirements: 
- Java API will use Hibernate to communicate with a PostGreSQL RDBMS 
- Java API will leverage the Spring Framework 
- Java API will be RESTful (no `HttpSession`, use JWTs!)
- Complete CI/CD pipelines will use AWS (CodePipeline, CodeBuild, Elastic Beanstalk, and S3)
 

Other requirements: 
- Application will demonstrate at least ten individual user stories 
- Application will leverage at least one external API 
- Application's own data model must be sufficiently complex (i.e. >2 tables) 
- RDBMS will be deployed to the cloud (AWS RDS) 
- Java API will be deployed to the cloud (AWS EC2) 
- UI application will be deployed to the cloud (AWS S3) 
- Java API will have >=80% test coverage for service layer
- Java API will leverage Spring's MockMvc for integration/e2e tests of controller endpoints

Suggested bonus goals:
- Deploy API using ECS w/ Docker (instead of Elastic Beanstalk)
- Secure your Java API using Spring Security
- Java API will be adequately documented (Java Docs and web endpoint documentation [Swagger/OpenAPI])
 
## Other Thoughts
The project concepts must be approved by the trainer. Remember to keep user stories clear and unambiguous. Keep in mind that you only have 3 weeks to work on this project so make your MVP something attainable. In addition to your project proposal, teams should also structure themselves with one team leader and a person or persons who fulfill the role of Gitflow manager and DevOps engineer.  Lastly, avoid the temptation to divide work into "API" and "UI", all associates must implement logic on both sides of the stack! 

## Presentations

Presentations will occur on the morning of Friday, December 17th, 2021. All team members must have a speaking role in the presentation of the application, and a PowerPoint slideshow is encouraged to accompany your presentation.
