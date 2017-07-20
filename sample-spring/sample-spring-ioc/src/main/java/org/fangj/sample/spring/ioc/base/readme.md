Injection vs. Lookup
Choosing which style of IoC to use—injection or lookup—is not usually a difficult decision. In many cases, the type 
of IoC you use is mandated by the container you are using. For instance, if you are using EJB 2.1 or prior versions, 
you must use lookup-style IoC (via JNDI) to obtain an EJB from the JEE container. In Spring, aside from initial bean 
lookups, your components and their dependencies are always wired together using injection-style IoC.

