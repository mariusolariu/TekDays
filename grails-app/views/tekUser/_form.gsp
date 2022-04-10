<%@ page import="com.tekdays.TekUser" %>



<div class="fieldcontain ${hasErrors(bean: tekUserInstance, field: 'firstName', 'error')} required">
	<label for="firstName">
		<g:message code="tekUser.firstName.label" default="First Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="firstName" required="" value="${tekUserInstance?.firstName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: tekUserInstance, field: 'lastName', 'error')} ">
	<label for="lastName">
		<g:message code="tekUser.lastName.label" default="Last Name" />
		
	</label>
	<g:textField name="lastName" value="${tekUserInstance?.lastName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: tekUserInstance, field: 'email', 'error')} ">
	<label for="email">
		<g:message code="tekUser.email.label" default="Email" />
		
	</label>
	<g:textField name="email" value="${tekUserInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: tekUserInstance, field: 'website', 'error')} ">
	<label for="website">
		<g:message code="tekUser.website.label" default="Website" />
		
	</label>
	<g:textField name="website" value="${tekUserInstance?.website}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: tekUserInstance, field: 'bio', 'error')} ">
	<label for="bio">
		<g:message code="tekUser.bio.label" default="Bio" />
		
	</label>
	<g:textArea name="bio" cols="40" rows="5" maxlength="5000" value="${tekUserInstance?.bio}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: tekUserInstance, field: 'password', 'error')} required">
	<label for="password">
		<g:message code="tekUser.password.label" default="Password" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="password" required="" value="${tekUserInstance?.password}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: tekUserInstance, field: 'username', 'error')} required">
	<label for="username">
		<g:message code="tekUser.username.label" default="Username" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="username" required="" value="${tekUserInstance?.username}"/>

</div>

