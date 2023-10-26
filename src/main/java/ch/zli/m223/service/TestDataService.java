// package ch.zli.m223.service;

// import javax.enterprise.event.Observes;
// import javax.inject.Inject;
// import javax.persistence.EntityManager;

// import ch.zli.m223.model.Category;
// import io.quarkus.runtime.StartupEvent;

// public class TestDataService {

// @Inject
// Category category;
// EntityManager entityManager;

// void generateData(@Observes StartupEvent event) {
// var projectACategory = new Category();
// projectACategory.setTitle("Project A");
// entityManager.persist(projectACategory);
// }

// // void generateData(@Observes StartupEvent event)
// // new Category
// // .setTitle
// // entitiyManager.persists(variable)

// }
