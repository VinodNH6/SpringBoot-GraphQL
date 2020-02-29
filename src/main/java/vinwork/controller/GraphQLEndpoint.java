package vinwork.controller;

import com.coxautodev.graphql.tools.SchemaParser;
import javax.servlet.annotation.WebServlet;
import graphql.servlet.SimpleGraphQLServlet;

//
//@WebServlet(urlPatterns = "/graphql")
//public class GraphQLEndpoint extends SimpleGraphQLServlet {
//
//    public GraphQLEndpoint() {
//			LinkRepository linkRepository = new LinkRepository();
//        super(SchemaParser.newParser()
//                .file("schema.graphqls") //parse the schema file created earlier
//				  .resolvers(
//				        new Query(linkRepository),
//				        new Mutation(linkRepository, userRepository, voteRepository),
//				        new SigninResolver(),
//				        new LinkResolver(userRepository),
//				        new VoteResolver(linkRepository, userRepository)) //new resolver
//				  .scalars(Scalars.dateTime) //register the new scalar
//                .build()
//                .makeExecutableSchema());
//    }
//}






//public class Mutation implements GraphQLRootResolver {
//    
//    private final LinkRepository linkRepository;
//
//    public Mutation(LinkRepository linkRepository) {
//        this.linkRepository = linkRepository;
//    }
//    
//    public Link createLink(String url, String description) {
//        Link newLink = new Link(url, description);
//        linkRepository.saveLink(newLink);
//        return newLink;
//    }
//}