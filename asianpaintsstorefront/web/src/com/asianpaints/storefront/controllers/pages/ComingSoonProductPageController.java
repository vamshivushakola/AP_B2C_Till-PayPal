/**
 *
 */
/*
 * package com.asianpaints.storefront.controllers.pages;
 * 
 * import de.hybris.platform.acceleratorstorefrontcommons.controllers.AbstractController; import
 * de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages; import
 * de.hybris.platform.acceleratorstorefrontcommons.forms.ReviewForm; import
 * de.hybris.platform.cms2.exceptions.CMSItemNotFoundException; import
 * de.hybris.platform.core.model.product.ProductModel;
 * 
 * import java.util.Collections;
 * 
 * import javax.servlet.http.HttpServletRequest;
 * 
 * import org.springframework.ui.Model; import org.springframework.validation.BindingResult; import
 * org.springframework.web.bind.annotation.PathVariable; import org.springframework.web.bind.annotation.RequestMapping;
 * import org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.servlet.mvc.support.RedirectAttributes;
 * 
 * 
 *//**
   * Controller for Product Details Page
   *
   *//*
	  * public class ComingSoonProductPageController extends AbstractController {
	  * 
	  * //comingSoonProducts()
	  * 
	  * @RequestMapping(value = /coming-soon/product, method = RequestMethod.GET) public String postReview(@PathVariable
	  * final String productCode, final ReviewForm form, final BindingResult result, final Model model, final
	  * HttpServletRequest request, final RedirectAttributes redirectAttrs) throws CMSItemNotFoundException {
	  * getReviewValidator().validate(form, result);
	  * 
	  * final ProductModel productModel = productService.getProductForCode(productCode);
	  * 
	  * if (result.hasErrors()) { updatePageTitle(productModel, model); GlobalMessages.addErrorMessage(model,
	  * "review.general.error"); model.addAttribute("showReviewForm", Boolean.TRUE);
	  * populateProductDetailForDisplay(productModel, model, request, Collections.EMPTY_LIST); storeCmsPageInModel(model,
	  * getPageForProduct(productModel)); return getViewForPage(model); } }
	  */