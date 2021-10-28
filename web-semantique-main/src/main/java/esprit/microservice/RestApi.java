package esprit.microservice;

import org.apache.jena.rdf.model.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {
	
	Model model = JenaEngine.readModel("data/Parfumerie.owl");


	@GetMapping("/employee")
	@CrossOrigin(origins = "http://localhost:3000")
	public String afficherEmp() {
		String NS = "";
		// lire le model a partir d'une ontologie
		if (model != null) {
			// lire le Namespace de l�ontologie
			NS = model.getNsPrefixURI("");

			// apply our rules on the owlInferencedModel
			Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

			// query on the model after inference
			String res =  JenaEngine.executeQueryFile(inferedModel, "data/employee_query.txt");
			System.out.println(res);
			return res;
			

		} else {
			return ("Error when reading model from ontology");
		}
	}
	
	@GetMapping("/caissiers")
	@CrossOrigin(origins = "http://localhost:3000")
	public String afficheCaissier() {
		String NS = "";
		// lire le model a partir d'une ontologie
		if (model != null) {
			// lire le Namespace de l�ontologie
			NS = model.getNsPrefixURI("");

			// apply our rules on the owlInferencedModel
			Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

			// query on the model after inference
			String res =  JenaEngine.executeQueryFile(inferedModel, "data/query_caissier.txt");
			System.out.println(res);
			return res;
			

		} else {
			return ("Error when reading model from ontology");
		}
	}
	
	
	@GetMapping("/managers")
	@CrossOrigin(origins = "http://localhost:3000")
	public String afficheManagers() {
		String NS = "";
		// lire le model a partir d'une ontologie
		if (model != null) {
			// lire le Namespace de l�ontologie
			NS = model.getNsPrefixURI("");

			// apply our rules on the owlInferencedModel
			Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

			// query on the model after inference
			String res =  JenaEngine.executeQueryFile(inferedModel, "data/query_manager.txt");
			System.out.println(res);
			return res;
			

		} else {
			return ("Error when reading model from ontology");
		}
	}
	
	@GetMapping("/clients")
	@CrossOrigin(origins = "http://localhost:3000")
	public String afficherClients() {
		String NS = "";
		// lire le model a partir d'une ontologie
		if (model != null) {
			// lire le Namespace de l�ontologie
			NS = model.getNsPrefixURI("");

			// apply our rules on the owlInferencedModel
			Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

			// query on the model after inference
			String res =  JenaEngine.executeQueryFile(inferedModel, "data/query_client.txt");
			System.out.println(res);
			return res;
			

		} else {
			return ("Error when reading model from ontology");
		}
	}
	
	@GetMapping("/produits")
	@CrossOrigin(origins = "http://localhost:3000")
	public String afficherProd() {
		String NS = "";
		// lire le model a partir d'une ontologie
		if (model != null) {
			// lire le Namespace de l�ontologie
			NS = model.getNsPrefixURI("");

			// apply our rules on the owlInferencedModel
			Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

			// query on the model after inference
			String res =  JenaEngine.executeQueryFile(inferedModel, "data/query_produits.txt");
			System.out.println(res);
			return res;
			

		} else {
			return ("Error when reading model from ontology");
		}
	}
	
	@GetMapping("/soins")
	@CrossOrigin(origins = "http://localhost:3000")
	public String afficherSoin() {
		String NS = "";
		// lire le model a partir d'une ontologie
		if (model != null) {
			// lire le Namespace de l�ontologie
			NS = model.getNsPrefixURI("");

			// apply our rules on the owlInferencedModel
			Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

			// query on the model after inference
			String res =  JenaEngine.executeQueryFile(inferedModel, "data/query_soin.txt");
			System.out.println(res);
			return res;
			

		} else {
			return ("Error when reading model from ontology");
		}
	}

	
	@GetMapping("/capillaires")
	@CrossOrigin(origins = "http://localhost:3000")
	public String afficherCap() {
		String NS = "";
		// lire le model a partir d'une ontologie
		if (model != null) {
			// lire le Namespace de l�ontologie
			NS = model.getNsPrefixURI("");

			// apply our rules on the owlInferencedModel
			Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

			// query on the model after inference
			String res =  JenaEngine.executeQueryFile(inferedModel, "data/query_capillaire.txt");
			System.out.println(res);
			return res;
			

		} else {
			return ("Error when reading model from ontology");
		}
	}

	
	@GetMapping("/maquillages")
	@CrossOrigin(origins = "http://localhost:3000")
	public String afficherMake() {
		String NS = "";
		// lire le model a partir d'une ontologie
		if (model != null) {
			// lire le Namespace de l�ontologie
			NS = model.getNsPrefixURI("");

			// apply our rules on the owlInferencedModel
			Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

			// query on the model after inference
			String res =  JenaEngine.executeQueryFile(inferedModel, "data/query_maquillage.txt");
			System.out.println(res);
			return res;
			

		} else {
			return ("Error when reading model from ontology");
		}
	}
	
	
	
	@GetMapping("/visages")
	@CrossOrigin(origins = "http://localhost:3000")
	public String afficherVisa() {
		String NS = "";
		// lire le model a partir d'une ontologie
		if (model != null) {
			// lire le Namespace de l�ontologie
			NS = model.getNsPrefixURI("");

			// apply our rules on the owlInferencedModel
			Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

			// query on the model after inference
			String res =  JenaEngine.executeQueryFile(inferedModel, "data/query_visage.txt");
			System.out.println(res);
			return res;
			

		} else {
			return ("Error when reading model from ontology");
		}
	}
	
	
	@GetMapping("/corps")
	@CrossOrigin(origins = "http://localhost:3000")
	public String afficherCorp() {
		String NS = "";
		// lire le model a partir d'une ontologie
		if (model != null) {
			// lire le Namespace de l�ontologie
			NS = model.getNsPrefixURI("");

			// apply our rules on the owlInferencedModel
			Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

			// query on the model after inference
			String res =  JenaEngine.executeQueryFile(inferedModel, "data/query_corp.txt");
			System.out.println(res);
			return res;
			

		} else {
			return ("Error when reading model from ontology");
		}
	}
	
	@GetMapping("/skincares")
	@CrossOrigin(origins = "http://localhost:3000")
	public String afficherSkin() {
		String NS = "";
		// lire le model a partir d'une ontologie
		if (model != null) {
			// lire le Namespace de l�ontologie
			NS = model.getNsPrefixURI("");

			// apply our rules on the owlInferencedModel
			Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, "data/rules.txt");

			// query on the model after inference
			String res =  JenaEngine.executeQueryFile(inferedModel, "data/query_skincare.txt");
			System.out.println(res);
			return res;
			

		} else {
			return ("Error when reading model from ontology");
		}
	}

}
