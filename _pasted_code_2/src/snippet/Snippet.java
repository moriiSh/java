package snippet;

public class Snippet {
	model.addAttribute("form", PostFactory.newPost());
				model = setList(model);
				model.addAttribute("path", "create");
				return "layout";
	
}

