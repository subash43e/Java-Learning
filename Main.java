class Day {
    public void Sunday() {
        System.out.println(
                "Sunday Funday - A day for leisure activities, family time, or preparing for the upcoming week.");
    }

    public void Monday() {
        System.out.println("Motivational Monday - A day to set goals and inspire productivity for the week ahead.");
    }

    public void Tuesday() {
        System.out.println(
                "Taco Tuesday - A popular day for enjoying tacos, often celebrated in restaurants with special deals.");
    }

    public void WednesDay() {
        System.out.println(
                "Wellness Wednesday - A focus on health and well-being, encouraging activities like exercise and self-care.");
    }

    public void Thursday() {
        System.out
                .println("Throwback Thursday - A social media trend where users share nostalgic photos and memories.");
    }

    public void Friday() {
        System.out.println(
                "Fun Friday - A day to unwind and celebrate the end of the workweek, often with social gatherings or outings.");
    }

    public void Saturday() {
        System.out.println(
                "Fun Friday - A day to unwind and celebrate the end of the workweek, often with social gatherings or outings.");
    }
}

class Days extends Day {
    public static void main(String[] args) {
        Day day = new Day();
        day.Sunday();
    }
}
