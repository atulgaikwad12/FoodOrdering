
<!--services-section-->
<div class="services-w3layouts" id="services">
	<!-- //Stats -->
			<div class="col-md-6 agitsworkw3ls-grid ">
			<h3 class="tittle-w3"><span>Always</span> fresh <span>& </span>delicious <span>food</span></h3>
			<p class="para-w3l">Gourmet is a full-service catering and event planning company dedicated to providing you with exquisite cuisine and fantastic customer service. We offer a variety of menus and design options, for everything from box lunches to full-service plated dinners.</p>
			<div class="services-left-w3-agile">
				<h3 class="tittle-w3 sub-head"><span>Our </span>Categories</h3>
				<ul>
				
				
				<c:forEach items="${categories}" var="category">
				<li><i class="fa fa-check" aria-hidden="true"></i><a href="${contextRoot}/show/category/${category.catid}/products">${category.catname}</a></c:forEach>
				
				
				<!-- <c:forEach var = "i" begin = "1" end = "5">
				<li><i class="fa fa-check" aria-hidden="true"></i>Category <c:out value = "${i}"/></li>
				</c:forEach>-->
					
				</ul>
				</div>
				<div class="services-right-w3-agile">
				<h3 class="tittle-w3 sub-head"><span>Catering</span> for</h3>
				<ul>
					<li><i class="fa fa-check" aria-hidden="true"></i>GRADUATION PARTY</li>
					<li><i class="fa fa-check" aria-hidden="true"></i>WEDDING PARTY</li>
					<li><i class="fa fa-check" aria-hidden="true"></i>BRIDAL SHOWER</li>
					<li><i class="fa fa-check" aria-hidden="true"></i>BIRTHDAY PARTY</li>
					<li><i class="fa fa-check" aria-hidden="true"></i>ANNIVERSARY</li>
				</ul>
				</div>
			</div>

			<div class="col-md-6 agitsworkw3ls-grid-2">
			   <div class="info-imgs">
			         <ul>
					  <li>
						  <div class="gallery-grid1">
								<a href="single.html"><img src="${images}/s1.jpg" alt=" " class="img-responsive"></a>
								<div class="p-mask">
										<h4><span>D</span>elish <span>F</span>ood</h4>
									<p>Neque porro quisquam est, qui dolorem ipsum.</p>
								</div>
							</div>
					  </li>
					   <li>
					     <div class="gallery-grid1">
							<a href="single.html"><img src="${images}/s2.jpg" alt=" " class="img-responsive"></a>
							<div class="p-mask">
									<h4><span>D</span>elish <span>F</span>ood</h4>
								<p>Neque porro quisquam est, qui dolorem ipsum.</p>
							</div>
						</div>
					   </li>
						<li>
						   <div class="gallery-grid1">
							<a href="single.html"><img src="${images}/s3.jpg" alt=" " class="img-responsive"></a>
							<div class="p-mask">
									<h4><span>D</span>elish <span>F</span>ood</h4>
								<p>Neque porro quisquam est, qui dolorem ipsum.</p>
							</div>
						</div>
						</li>
					    <li>
						  <div class="gallery-grid1">
							<a href="single.html"><img src="${images}/s4.jpg" alt=" " class="img-responsive"></a>
							<div class="p-mask">
									<h4><span>D</span>elish <span>F</span>ood</h4>
								<p>Neque porro quisquam est, qui dolorem ipsum.</p>
							</div>
						</div>
						</li>
					 </ul>
			   </div>
				
			</div>
			<div class="clearfix"></div>
	<!-- //Stats -->
<div class="clearfix"></div>
</div>
<!--//services-section-->
