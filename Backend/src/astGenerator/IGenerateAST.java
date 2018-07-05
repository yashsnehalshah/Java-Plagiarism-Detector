package astGenerator;

import java.util.List;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

public interface IGenerateAST {

	/**
	 * @param path1 path to repository 1
	 * @param path2 path to repository 2
	 * @effect: adds all methods and variables from the given paths
	 * 			to the respective lists
	 */
	public void astGenerator(String path1, String path2);

	/**
	 * @return returns list of MethodDeclaration generated by astGenerator method 
	 * 		   which are present in path 1
	 */
	public List<MethodDeclaration> getMethodList1();


	/**
	 * @return returns list of MethodDeclaration generated by astGenerator method 
	 * 		   which are present in path 2
	 */
	public List<MethodDeclaration> getMethodList2();


	/**
	 * @return returns list of VariableDeclarationFragment generated by astGenerator method 
	 * 		   which are present in path 1
	 */
	public List<VariableDeclarationFragment> getVariableList1();


	/**
	 * @return returns list of VariableDeclarationFragment generated by astGenerator method 
	 * 		   which are present in path 2
	 */
	public List<VariableDeclarationFragment> getVariableList2();
}