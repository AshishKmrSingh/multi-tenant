# How to contribute

Support and contributions from the open source community are essential for keeping
`@multi-tenant` up to date and always improving! There are a few guidelines that we need
contributors to follow to keep the project consistent, as well as allow us to keep
maintaining `@multi-tenant` in a reasonable amount of time.

Please note that this project is released with a [Contributor Code of Conduct][coc].

By participating in this project you agree to abide by its terms.

[coc]: ./CODE_OF_CONDUCT.md

## Creating an Issue

Before you create a new Issue:

1. Please make sure there is no [open issue](https://github.com/AshishKmrSingh/multi-tenant/issues) yet.
2. If it is a bug report, include the steps to reproduce the issue and please create a reproducible test case.
3. If it is a feature request, please share the motivation for the new feature and how you would implement it.
4. Please include links to the corresponding GitHub documentation.

## Tests

If you want to submit a bug fix or new feature, make sure that all tests are passing.

```
mvn test
```

Or run a specific test

```
mvn test -Dtest="TheFirstUnitTest"
```

To run a method from within a test

```
mvn test -Dtest="TheSecondUnitTest#whenTestCase2_thenPrintTest2_1" 
```

## Making Changes

- Create a topic branch from the main branch.
- Check for unnecessary whitespace / changes with `git diff --check` before committing.
- Keep git commit messages clear and appropriate. Ideally follow commit conventions described below.

## Submitting the Pull Request

- Push your changes to your topic branch on your fork of the repo.
- Submit a pull request from your topic branch to the main branch on the `multi-tenant` repository.
- Be sure to tag any issues your pull request is taking care of / contributing to. \* Adding "Closes #123" to a pull request description will auto close the issue once the pull request is merged in.

## Maintainers

See [MAINTAINING.md] [maintain]

[maintain]: ./MAINTAINING.md
