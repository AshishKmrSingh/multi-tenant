What are breaking and non-breaking changes in the context of the [HARMAN](https://github.com/HARMANInt)?

While the answer to that question might not always be clear we tend to follow what GitHub considers as breaking changes, 
while also taking some inspiration from [Square](https://developer.squareup.com/docs/build-basics/versioning-overview)
and [Stripe](https://stripe.com/docs/upgrades#what-changes-does-stripe-consider-to-be-backwards-compatible).

We use the [Semver](https://semver.org/) specification for all of our libraries. 
This means that when breaking changes are introduced we will "bump" the `MAJOR` version number on the library.

To help us detect these types of things we have a label (`Type: Breaking change`).
![Screenshot 2022-11-10 at 11 23 26 AM](https://user-images.githubusercontent.com/139819/201164127-861f658b-6039-48f8-b4fb-3054f710cc1a.png)

There could be a few reasons why you might want to add this label to your Pull Request or Issue.  Use the following list to help you better understand if you should add it or not.

- __Non-breaking changes__:
  - Adding new library APIs
  - Adding optional parameters to existing library APIs 
  - Adding new properties to existing library APIs models 
  - Changing the order of properties in existing library APIs models 
  - Changing the length or format of opaque strings (e.g., IDs, error messages, other human-readable strings)
  - Adding new string constants to enums
  - Adding new webhook event types/models
  - Deprecating a library APIs, response field, or parameter (not removing)
- __Breaking changes__: 
  - Adding new required parameters to existing library APIs
  - Removing an existing library API
  - Removing a field from a response model
  - Renaming a field in a response model
  - Changing the type of response model field or parameter 
  - Adding a validation rule to an existing parameter 
  - Changing the HTTP status code returned by a library API method

